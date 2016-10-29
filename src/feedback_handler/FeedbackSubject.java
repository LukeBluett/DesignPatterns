//package feedback_handler;

/*
	This interface is the subject in the observer pattern
	It holds the blue prints for classes that can be observed
*/

public interface FeedbackSubject {
	public void register(FeedbackObserver o);
	public void unregister(FeedbackObserver o);
	public void notifyObserver();
}
