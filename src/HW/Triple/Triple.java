package HW.Triple;

class Triple<T, S, E> {

    private T id;
    private S sum;
    private E name;

    Triple(T id, S sum, E name) {
        this.id = id;
        this.sum = sum;
        this.name = name;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public S getSum() {
        return sum;
    }

    public void setSum(S sum) {
        this.sum = sum;
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}

