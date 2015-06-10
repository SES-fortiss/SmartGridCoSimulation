/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package visualization;

import helper.IoHelper;
import helper.SerializationHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import topology.ActorTopology;
import akka.basicActors.ActorOptions;

/**
 * Created with IntelliJ IDEA.
 * User: amack
 * Date: 25.10.13
 * Time: 20:09
 * To change this template use File | Settings | File Templates.
 */

public class GridD3Json {
    public String name;
    public List<GridD3Json> children = new ArrayList<GridD3Json>();

    @Override
    public String toString() {
        return "{" +
                "'name':'" + name + '\'' +
                ", 'children':" + children +
                '}';
    }

    public static HashSet<String> getSupervisorChildren(ActorTopology topology) {
    	HashSet<String> childrenSet =  new HashSet<String>();
        for (String path: topology.getActorTopology().keySet()) {
            if (StringUtils.countMatches(path, "/") == 3) childrenSet.add(path.replace("/user/ActorSupervisor/", ""));
        }
        return childrenSet;
    }

    public GridD3Json(String name, List<GridD3Json> children) {
        this.name = name;
        this.children = children;
    }

    public GridD3Json() {
    }

    public static GridD3Json extractChildrenFromActorOptions(String actorPath, ActorOptions options, ActorTopology topology) {
        String actorName = getActorName(actorPath);
        
        // Sortieren
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String name: options.childrenNameList) arrayList.add(name);
        Collections.sort(arrayList);
        
        if (options.childrenNameList.isEmpty()) return new GridD3Json(actorName, null);
        else {
            GridD3Json gridD3Json = new GridD3Json();
            gridD3Json.name = actorName;
            for(String childName: arrayList) {
                gridD3Json.children.add(extractChildrenFromActorOptions(actorPath + "/" + childName, topology.getActorOptions(actorPath + "/" + childName), topology));
            }
            return gridD3Json;
        }
    }

    public static String getActorName(String actorPath) {
        return actorPath.substring(actorPath.lastIndexOf("/")+1);
    }

    public static void saveAsJson(String filePath, String json) {
        IoHelper.saveFile(filePath, json);
    }

    
    /**
     * 
     * This method converts the HashTable Topology to a JSON String
     * 
     * @param topology This is the GridTopology as input
     * @return
     */
    public static String convertToJson(ActorTopology topology) {    	
        ActorOptions supervisorOptions = new ActorOptions();                
        supervisorOptions.childrenNameList = getSupervisorChildren(topology);
        
        GridD3Json grid = new GridD3Json();
        if (supervisorOptions.childrenNameList.size() == 1){
        	String key = supervisorOptions.childrenNameList.iterator().next();
        	grid.name = key;
            String path = "/user/ActorSupervisor/" + key;
            grid = extractChildrenFromActorOptions(path, topology.getActorOptions(path), topology);   
        } else {
        	for (String key : supervisorOptions.childrenNameList){
	        	grid.name = "ActorSupervisor";
	            String path = "/user/ActorSupervisor/" + key;	            
	            grid.children.add(extractChildrenFromActorOptions(path, topology.getActorOptions(path), topology));
	        }
        }
        //GridD3Json grid = extractChildrenFromActorOptions("/user/ActorSupervisor", supervisorOptions, topology);  
        // das Grid ist eigentlich schon eine fertige JSON datei.   
        return SerializationHelper.serializeObject(grid);
    }

    public static void saveHtml(String filePath) {
        String html = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "	<meta charset=\"utf-8\">\n" + 
                "	<title>FortissSimulation</title>\n" +
                "	<script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>\n" +
                "	<script src=\"http://d3js.org/d3.v3.min.js\" charset=\"utf-8\"></script>\n" +
                "    <style>\n" +
                "        .node {\n" +
                "            cursor: pointer;\n" +
                "        }\n\n" +
                "        .node circle {\n" +
                "            fill: #fff;\n" +
                "            stroke: steelblue;\n" +
                "            stroke-width: 1.5px;\n" +
                "        }\n" +
                "\n" +
                "        .node text {\n" +
                "            font: 10px sans-serif;\n" +
                "        }\n" +
                "\n" +
                "        .link {\n" +
                "            fill: none;\n" +
                "            stroke: #ccc;\n" +
                "            stroke-width: 1.5px;\n" +
                "        }\n" +
                "\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<script>\n" +
                "\n" +
                "    var margin = {top: 20, right: 120, bottom: 20, left: 120},\n" +
                "            width = 960 - margin.right - margin.left,\n" +
                "            height = 800 - margin.top - margin.bottom;\n" +
                "\n" +
                "    var i = 0,\n" +
                "            duration = 750,\n" +
                "            root;\n" +
                "\n" +
                "    var tree = d3.layout.tree()\n" +
                "            .size([height, width]);\n" +
                "\n" +
                "    var diagonal = d3.svg.diagonal()\n" +
                "            .projection(function(d) { return [d.y, d.x]; });\n" +
                "\n" +
                "    var svg = d3.select(\"body\").append(\"svg\")\n" +
                "            .attr(\"width\", width + margin.right + margin.left)\n" +
                "            .attr(\"height\", height + margin.top + margin.bottom)\n" +
                "            .append(\"g\")\n" +
                "            .attr(\"transform\", \"translate(\" + margin.left + \",\" + margin.top + \")\");\n" +
                "\n" +
                "    d3.json(\"gridtopology.json\", function(error, topology) {\n" +
                "        root = topology;\n" +
                "        console.log(topology);\n" +
                "        root.x0 = height / 2;\n" +
                "        root.y0 = 0;\n" +
                "\n" +
                "        function collapse(d) {\n" +
                "            if (d.children) {\n" +
                "                d._children = d.children;\n" +
                "                d._children.forEach(collapse);\n" +
                "                d.children = null;\n" +
                "            }\n" +
                "        }\n" +
                "\n" +
                "        root.children.forEach(collapse);\n" +
                "        update(root);\n" +
                "    });\n" +
                "\n" +
                "    d3.select(self.frameElement).style(\"height\", \"800px\");\n" +
                "\n" +
                "    function update(source) {\n" +
                "\n" +
                "        // Compute the new tree layout.\n" +
                "        var nodes = tree.nodes(root).reverse(),\n" +
                "                links = tree.links(nodes);\n" +
                "\n" +
                "        // Normalize for fixed-depth.\n" +
                "        nodes.forEach(function(d) { d.y = d.depth * 180; });\n" +
                "\n" +
                "        // Update the nodes…\n" +
                "        var node = svg.selectAll(\"g.node\")\n" +
                "                .data(nodes, function(d) { return d.id || (d.id = ++i); });\n" +
                "\n" +
                "        // Enter any new nodes at the parent's previous position.\n" +
                "        var nodeEnter = node.enter().append(\"g\")\n" +
                "                .attr(\"class\", \"node\")\n" +
                "                .attr(\"transform\", function(d) { return \"translate(\" + source.y0 + \",\" + source.x0 + \")\"; })\n" +
                "                .on(\"click\", click);\n" +
                "\n" +
                "        nodeEnter.append(\"circle\")\n" +
                "                .attr(\"r\", 1e-6)\n" +
                "                .style(\"fill\", function(d) { return d._children ? \"lightsteelblue\" : \"#fff\"; });\n" +
                "\n" +
                "        nodeEnter.append(\"text\")\n" +
                "                .attr(\"x\", function(d) { return d.children || d._children ? -10 : 10; })\n" +
                "                .attr(\"dy\", \".35em\")\n" +
                "                .attr(\"text-anchor\", function(d) { return d.children || d._children ? \"end\" : \"start\"; })\n" +
                "                .text(function(d) { return d.name; })\n" +
                "                .style(\"fill-opacity\", 1e-6);\n" +
                "\n" +
                "        // Transition nodes to their new position.\n" +
                "        var nodeUpdate = node.transition()\n" +
                "                .duration(duration)\n" +
                "                .attr(\"transform\", function(d) { return \"translate(\" + d.y + \",\" + d.x + \")\"; });\n" +
                "\n" +
                "        nodeUpdate.select(\"circle\")\n" +
                "                .attr(\"r\", 4.5)\n" +
                "                .style(\"fill\", function(d) { return d._children ? \"lightsteelblue\" : \"#fff\"; });\n" +
                "\n" +
                "        nodeUpdate.select(\"text\")\n" +
                "                .style(\"fill-opacity\", 1);\n" +
                "\n" +
                "        // Transition exiting nodes to the parent's new position.\n" +
                "        var nodeExit = node.exit().transition()\n" +
                "                .duration(duration)\n" +
                "                .attr(\"transform\", function(d) { return \"translate(\" + source.y + \",\" + source.x + \")\"; })\n" +
                "                .remove();\n" +
                "\n" +
                "        nodeExit.select(\"circle\")\n" +
                "                .attr(\"r\", 1e-6);\n" +
                "\n" +
                "        nodeExit.select(\"text\")\n" +
                "                .style(\"fill-opacity\", 1e-6);\n" +
                "\n" +
                "        // Update the links…\n" +
                "        var link = svg.selectAll(\"path.link\")\n" +
                "                .data(links, function(d) { return d.target.id; });\n" +
                "\n" +
                "        // Enter any new links at the parent's previous position.\n" +
                "        link.enter().insert(\"path\", \"g\")\n" +
                "                .attr(\"class\", \"link\")\n" +
                "                .attr(\"d\", function(d) {\n" +
                "                    var o = {x: source.x0, y: source.y0};\n" +
                "                    return diagonal({source: o, target: o});\n" +
                "                });\n" +
                "\n" +
                "        // Transition links to their new position.\n" +
                "        link.transition()\n" +
                "                .duration(duration)\n" +
                "                .attr(\"d\", diagonal);\n" +
                "\n" +
                "        // Transition exiting nodes to the parent's new position.\n" +
                "        link.exit().transition()\n" +
                "                .duration(duration)\n" +
                "                .attr(\"d\", function(d) {\n" +
                "                    var o = {x: source.x, y: source.y};\n" +
                "                    return diagonal({source: o, target: o});\n" +
                "                })\n" +
                "                .remove();\n" +
                "\n" +
                "        // Stash the old positions for transition.\n" +
                "        nodes.forEach(function(d) {\n" +
                "            d.x0 = d.x;\n" +
                "            d.y0 = d.y;\n" +
                "        });\n" +
                "    }\n" +
                "\n" +
                "    // Toggle children on click.\n" +
                "    function click(d) {\n" +
                "        if (d.children) {\n" +
                "            d._children = d.children;\n" +
                "            d.children = null;\n" +
                "        } else {\n" +
                "            d.children = d._children;\n" +
                "            d._children = null;\n" +
                "        }\n" +
                "        update(d);\n" +
                "    }\n" +
                "\n" +
                "</script>\n" +
                "</body>\n" +
                "</html>";
        IoHelper.saveFile(filePath, html);
    }
}
