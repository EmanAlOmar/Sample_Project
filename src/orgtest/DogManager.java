// Test
package orgtest;
import org.animals.Dog;


public class DogManager {

	private Dog dog;
	public DogManager(Dog aDog) {
		this.dog = aDog;
	}
	
	public void doStuff() {
		barkBark(this.dog);
		
		int age = dog.getAge();
		int sum = 0;
		for (int i = 0; i < age; i++) {
			System.out.println(i);
			sum += i;
		}
		sum -= dog.magicNumber;
		dog.takeaBreath();
	}

	public void barkBark(Dog dog) {
		System.out.println("ruff");
		System.out.println("ruff");
		dog.takeaBreath();
		System.out.println("ruff");
		System.out.println("ruff");
		System.out.println("ruff");
	}

}
