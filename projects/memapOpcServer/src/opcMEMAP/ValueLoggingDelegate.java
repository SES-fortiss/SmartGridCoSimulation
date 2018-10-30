package opcMEMAP;

import javax.annotation.Nullable;

import org.eclipse.milo.opcua.sdk.server.api.nodes.VariableNode;
import org.eclipse.milo.opcua.sdk.server.nodes.AttributeContext;
import org.eclipse.milo.opcua.sdk.server.nodes.delegates.AttributeDelegate;
import org.eclipse.milo.opcua.sdk.server.nodes.delegates.DelegatingAttributeDelegate;
import org.eclipse.milo.opcua.stack.core.UaException;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ValueLoggingDelegate extends DelegatingAttributeDelegate {

    private final Logger logger = LoggerFactory.getLogger(ValueLoggingDelegate.class);

    public ValueLoggingDelegate(@Nullable AttributeDelegate parent) {
        super(parent);
    	System.out.println("ValueLoggingDelegate: HeyDo Constructor");
    }

    @Override
    public DataValue getValue(AttributeContext context, VariableNode node) throws UaException {
        DataValue value = super.getValue(context, node);

        // only log external reads
        if (context.getSession().isPresent()) {
            logger.info(
                "getValue() nodeId={} value={}",
                node.getNodeId(), value);
        }

        return value;
    }

    @Override
    public void setValue(AttributeContext context, VariableNode node, DataValue value) throws UaException {
        // only log external writes
        if (context.getSession().isPresent()) {
            logger.info(
                "setValue() nodeId={} value={}",
                node.getNodeId(), value);
        }

        super.setValue(context, node, value);
    }

}
