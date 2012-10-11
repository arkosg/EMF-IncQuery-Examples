package org.jnect.demo.incquery.esper.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternMatch;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryException;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.misc.DeltaMonitor;
import org.jnect.bodymodel.PositionedElement;
import org.jnect.core.KinectManager;
import org.jnect.demo.incquery.esper.EsperManager;
import org.jnect.demo.incquery.esper.events.PatternMatchEvent;
import org.jnect.demo.incquery.esper.events.PatternMatchEventType;
import org.jnect.demo.incquery.views.YMCADemoView;

import bodymodel.ymca.a.AMatcher;
import bodymodel.ymca.c.CMatcher;
import bodymodel.ymca.i.IMatcher;
import bodymodel.ymca.m.MMatcher;
import bodymodel.ymca.q.QMatcher;
import bodymodel.ymca.y.YMatcher;

//import bodymodel.jump.JumpMatcher;

/**
 * Handler class for the Jnect/IncQuery awt.Robot demo.
 * @author istvanrath
 * 
 */
public class StartRobotDemoHandler extends AbstractHandler {

	

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
//		if (KinectManager.INSTANCE.isSkeletonTrackingStarted()) {
		    try {
	            Thread t = new Thread(new Runnable() {

	                @Override
	                public void run() {
	                    try {
	                        samplingTestRobot();
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }
	                   
	                }
	                
	            }, "Esper Robot Debug");
	            t.start();
	            
	        } catch (Exception e) {
	            throw new ExecutionException(e.getLocalizedMessage(), e);
	        }

//		} else {
//			System.out.println("Start skeleton simulator first!");
//		}
		return null;
	}
	
	/**
     * Another test-case for the sampling processing mode.
     * 
     * @throws InterruptedException
     */
    private void samplingTestRobot() throws InterruptedException {
        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "U", PatternMatchEventType.NEW));
        YMCADemoView.appendStringIncQuery("U");
        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "U", PatternMatchEventType.LOST));

        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "U", PatternMatchEventType.NEW));
        YMCADemoView.appendStringIncQuery("U");
        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "U", PatternMatchEventType.LOST));

        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "U", PatternMatchEventType.NEW));
        YMCADemoView.appendStringIncQuery("U");
        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "U", PatternMatchEventType.LOST));

        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "U", PatternMatchEventType.NEW));
        YMCADemoView.appendStringIncQuery("U");
        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "U", PatternMatchEventType.LOST));

        Thread.sleep(1000l);

        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "U", PatternMatchEventType.NEW));
        YMCADemoView.appendStringIncQuery("U");
        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "U", PatternMatchEventType.LOST));

        Thread.sleep(700l);

        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "U", PatternMatchEventType.NEW));
        YMCADemoView.appendStringIncQuery("U");
        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "U", PatternMatchEventType.LOST));

        Thread.sleep(400l);

        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "U", PatternMatchEventType.NEW));
        YMCADemoView.appendStringIncQuery("U");
        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "U", PatternMatchEventType.LOST));

        Thread.sleep(5500l);

        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "D", PatternMatchEventType.NEW));
        YMCADemoView.appendStringIncQuery("D");
        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "D", PatternMatchEventType.LOST));

        Thread.sleep(700l);

        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "D", PatternMatchEventType.NEW));
        YMCADemoView.appendStringIncQuery("D");
        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "D", PatternMatchEventType.LOST));

        Thread.sleep(400l);

        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "D", PatternMatchEventType.NEW));
        YMCADemoView.appendStringIncQuery("D");
        EsperManager.getInstance().sendEvent(new PatternMatchEvent(null, "D", PatternMatchEventType.LOST));
        
    }

}
