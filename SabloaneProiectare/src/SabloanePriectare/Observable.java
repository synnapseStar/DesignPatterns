package SabloanePriectare;

public interface Observable {
	
	void AddObserver(Observer observer);
    void RemoveObserver(Observer observer);
    void NotifyAllObservers();
	
}
