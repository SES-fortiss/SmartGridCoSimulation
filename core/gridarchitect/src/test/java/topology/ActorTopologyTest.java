/*
 * Copyright (c) 2011-2015, fortiss GmbH.
 * Licensed under the Apache License, Version 2.0.
 *
 * Use, modification and distribution are subject to the terms specified
 * in the accompanying license file LICENSE.txt located at the root directory
 * of this software distribution.
 */

package topology;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import resultSaving.NoSave;
import topology.ActorTopology;
import akka.basicActors.ActorOptions;
import akka.basicActors.LoggingMode;
import behavior.InactiveBehaviorModel;

/**
 * Created with IntelliJ IDEA.
 * User: amack
 * Date: 09.10.13
 * Time: 11:04
 * To change this template use File | Settings | File Templates.
 */
public class ActorTopologyTest {


    @Test
    public void testAddActorValid() {
        ActorTopology topology =  new ActorTopology("GridTopologyTest");
        ActorOptions options = new ActorOptions(LoggingMode.DEBUG, new HashSet<String>(), new HashSet<String>(),new HashSet<String>(),
                new InactiveBehaviorModel(), new NoSave());
        topology.addActor("/some/Actor", options);
        Assert.assertEquals(topology.getActorOptions("/some/Actor").loggingMode, LoggingMode.DEBUG);
    }

    @Test(expected = NullPointerException.class)
    public void testGetNotExistingActor() {
        ActorTopology topology =  new ActorTopology("GridTopologyTest");

        ActorOptions options = new ActorOptions(LoggingMode.DEBUG, null, new HashSet<String>(),new HashSet<String>(),
                new InactiveBehaviorModel(), new NoSave());
        topology.addActor("/some/Actor", options);
        topology.getActorOptions("/unknown/Actor");
    }

    @Test(expected = NullPointerException.class)
    public void testReplaceActorPathOldEntryIsRemoved() {
    }

    @Test
    public void testReplaceActorPathForSubGridAddition() {
        ActorTopology topology = new ActorTopology("");
        String actual = topology.replaceActorPathForSubGridAddition("/user/ActorSupervisor/Some/Actor/Parent", "/user/ActorSupervisor/Some/Other/Actor");

        Assert.assertEquals("/user/ActorSupervisor/Some/Actor/Parent/Some/Other/Actor", actual);
    }

    @Test
    public void testIsRootActor() {
        ActorTopology topology = new ActorTopology("");

        Assert.assertTrue(topology.isRootActor("/user/ActorSupervisor/Actor"));
        Assert.assertFalse(topology.isRootActor("/user/ActorSupervisor/Actor/Other"));
        Assert.assertFalse(topology.isRootActor("/user/ActorSupervisor"));
    }

	@Test
    public void testAppendChildrenList() {
		HashSet<String> childrenList = new HashSet<String>();
        childrenList.add("SomeChild");
        ActorOptions options = new ActorOptions(null, childrenList, new HashSet<String>(), null, null,null);
        ActorTopology topology = new ActorTopology("");
        List<String> toAdd = new ArrayList<String>();
        toAdd.add("New1");
        toAdd.add("New2");
        topology.appendChildrenList("",options, toAdd);

        Assert.assertTrue(options.childrenNameList.containsAll(Arrays.asList("SomeChild", "New1", "New2")) && Arrays.asList("SomeChild", "New1", "New2").containsAll(options.childrenNameList));
        
    }

	@Test(expected = IllegalArgumentException.class)
    public void testAppendChildrenListChildAlreadyExists() {
		HashSet<String> childrenList = new HashSet<String>();
        childrenList.add("New1");
        ActorOptions options = new ActorOptions(null, childrenList, new HashSet<String>(), null,null, null);
        ActorTopology topology = new ActorTopology("");
        List<String> toAdd = new ArrayList<String>();
        toAdd.add("New1");
        toAdd.add("New2");
        topology.appendChildrenList("",options, toAdd);
    }

    @Test
    public void testGetActorName() {
        ActorTopology topology =  new ActorTopology("");

        Assert.assertEquals("Actor", topology.getActorName("/user/ActorSupervisor/Some/Actor"));
        Assert.assertEquals("Some", topology.getActorName("/user/ActorSupervisor/Some"));
        Assert.assertEquals("Blub", topology.getActorName("/user/ActorSupervisor/Some/Actor/Blub"));
        Assert.assertEquals("Other", topology.getActorName("/user/ActorSupervisor/Some/Actor/Stuff/Other"));
    }
    
}
