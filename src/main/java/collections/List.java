package collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class List<T extends Comparable<T>> {
    Logger log= LogManager.getLogger(this.getClass());
    T[] a;
    int num;

    public List(int num) {
        log.info("Created list");
        a = (T[]) new Comparable[num];
        this.num = 0;
    }

    public void add(T x) {
        log.info("Enter add()");
        if (num == a.length - 1) {
            T[] b = (T[]) new Comparable[a.length + 1];
            for (int i = 0; i < a.length; ++i)
                b[i] = a[i];
            b[num] = x;
            a = (T[]) new Comparable[b.length];
            for(int i=0;i<a.length;++i)
                a[i]=b[i];

        } else
            a[num] = x;
        num = num + 1;
        log.info("finished add()");
    }

    public int size() {
        log.info("Entered size()");
        log.info("finished size()");
        return num;
    }

    public T get(int index) {
        log.info("Entered get()");
        try {
            return a[index];
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Index out of range");
        }
        return null;
    }

    public void display() {
        log.info("Entered display()");
        for (int i = 0; i < num; ++i) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        log.info("finished display()");
    }

    public void delete(T element) {
        log.info("Entered delete()");
        for (int i = 0; i < num; ++i) {
            if ((a[i]).compareTo(element)==0){
                for (int j = i; j < a.length - 1; ++j) {
                    a[j] = a[j + 1];
                }
                num--;
                log.info("finished delete()");
                return;
            }
        }
        System.out.println("Element not found");
        log.info("finished delete()");
    }

}
