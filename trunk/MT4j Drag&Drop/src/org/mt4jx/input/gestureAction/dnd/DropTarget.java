package org.mt4jx.input.gestureAction.dnd;

import org.mt4j.components.MTComponent;
import org.mt4j.input.inputProcessors.componentProcessors.dragProcessor.DragEvent;

/**
 * @author Uwe Laufs
 * @see DragAndDropAction
 */
public interface DropTarget {
	
	/**
	 * Is called by DropAction or DragAndDropAction, when a component is dropped on top of the MTDropTarget. 
	 * @param droppedComponent The MTComponent that is dropped on top of the MTDropTarget.
	 */
	public void componentDropped(MTComponent droppedComponent, DragEvent de);

}
