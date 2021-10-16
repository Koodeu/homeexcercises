package kl.zadanie5;

import java.util.HashSet;
import java.util.List;

public class SDAHashSet extends HashSet<String> {

    private List<String> list;

    public SDAHashSet(List<String> list) {
        this.list = list;
    }

    @Override
    public int size() {
        return list.size()*2;
    }

    @Override
    public boolean add(String s) {
        return super.add(s);
    }

    @Override
    public void clear() {
        list.clear();
//        System.out.println("lista została wyczyszczona. Jej obecny rozmiar wynosi" + list.size());
    }

    @Override
    public boolean contains(Object o) {
        return super.contains(o);
    }

    @Override
    public boolean remove(Object o) {
        return super.remove(o);
    }
}
