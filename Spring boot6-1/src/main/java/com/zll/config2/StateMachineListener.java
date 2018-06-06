package com.zll.config2;

import org.springframework.messaging.Message;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.state.State;
import org.springframework.statemachine.transition.Transition;

/**
 * Created by zll on 2018/3/27 0027.
 */
public interface StateMachineListener<S,E> {

    void stateChanged(State<S,E> from, State<S,E> to);

    void stateEntered(State<S,E> state);

    void stateExited(State<S,E> state);

    void eventNotAccepted(Message<E> event);

    void transition(Transition<S, E> transition);

    void transitionStarted(Transition<S, E> transition);

    void transitionEnded(Transition<S, E> transition);

    void stateMachineStarted(StateMachine<S, E> stateMachine);

    void stateMachineStopped(StateMachine<S, E> stateMachine);

    void stateMachineError(StateMachine<S, E> stateMachine, Exception exception);

    void extendedStateChanged(Object key, Object value);

    void stateContext(StateContext<S, E> stateContext);

}