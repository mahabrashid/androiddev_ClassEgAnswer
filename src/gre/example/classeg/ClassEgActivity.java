package gre.example.classeg;

import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;

class Student {
	private String name;
	private int mark;
	private int age;

	public Student(String n, int m, int a) {
		name = n;
		mark = m;
		age = a;
	}

	public String getName() {
		return name;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int m) {
		mark = m;
	}
    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        this.age = a;
    }
}

public class ClassEgActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TextView main = (TextView) findViewById(R.id.TextView_Main);

		/* code we are interested in */

		Student studentOne = new Student("David", 67, 37), studentTwo = new Student(
				"Victoria", 85, 38);

		main.setText(studentOne.getName() + " scored " + studentOne.getMark()
				+ " marks\n");
		main.append(studentTwo.getName() + " scored " + studentTwo.getMark()
				+ " marks\n");
		studentOne.setMark(99);
		// code added to call setAge() and getAge()
        studentOne.setAge(50); 
		main.append(studentOne.getName() + " scored " + studentOne.getMark()
				+ " marks" + " age is " + studentOne.getAge());

	}

}
