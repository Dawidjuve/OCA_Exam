package test.book.chapter5;

interface HasVocalCords {
	public abstract void makeSound();
}

public interface CanBark extends HasVocalCords {
	public void bark();
}

//14. wybierz poprawne odpwiedzi
//A. The CanBark interface doesn’t compile.
//B. A class that implements HasVocalCords must override the makeSound() method.
//C. A class that implements CanBark inherits both the makeSound() and bark() methods.
//D. A class that implements CanBark only inherits the bark() method.
//E. An interface cannot extend another interface.