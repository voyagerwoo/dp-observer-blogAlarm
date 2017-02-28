package voyagerwoo.dp.blogalarm.subject;

import voyagerwoo.dp.blogalarm.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject<D> {
    private List<Observer<D>> observers;

    protected Subject() {
        this.observers = new ArrayList<Observer<D>>();
    }


    public void registerObserver(Observer<D> observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer<D> observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        D data = getData();
        for( Observer<D> o : observers) {
            o.update(data);
        }
    }

    protected abstract D getData();
}
