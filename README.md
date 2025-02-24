# The first program is in "myfirstprogram" including MatrixCalculator with test, report for further explaination.


## My first JAVA program is a matrix calculator.




# Preface

The first section here is the knowledge that attracts most of my interests on this module, followed by the lecture notes I tapped when I am on the journey of this module.


# Book---Clean code reading

## Motivation

-   God is in the details. --Today's agile world needs the role of architecture with patient to internalize the idea of "small things matter", especially in software development.

-   Craftmanship is important in these two aspects:

    -   Knowledge of principles, patterns

    -   Work hard and practic/sweat over it and watch myself fail.

So, please grind the knowledge with forever practice!

-   Code represents the details of the requirements.

-   defend the code with equal passion

-   A programmer with "code-sense" will look at messy module and see options and variations, helping choose the best variation and guide to plot a sequence of behavior preserving transformations to get from here to there.

-   A programmer who writes clean code is an artist who can take a blank screen through a series of transformations until it is an elegantly coded system

- 　A systematic idea holds all while catch all possibility in a code design so do not tap first, write even draw instead.



## static
有无static的区别：有static，即静态的，objects共享一个memory；无static，objects各有各的memory

Idea: This make sense since a class is just a blueprint which could not execute a non-static method and it is "public void xx" that gives each instance different characteristic. So non-static method can only be called on individual objects.

``` java
Cat mycat= new Cat();
mycat.meow();

Cat.meow();//this does not makes sence since meow is non-static
```

``` java
public class Person {
    private String name;
    private String gender;
    private String city;
    private String dateOfBirth;
    private int idNumber;
    private int personNumber;  // 每个对象的独立编号
    private static int count;  // 静态变量用于追踪总对象数量

    // 完整构造函数
    public Person(String nam, String gender, String city, String DoB, int id) {
        this.name = nam;
        this.gender = gender;
        this.city = city;
        this.dateOfBirth = DoB;
        this.idNumber = id;
        count++;  // 递增静态计数器
        this.personNumber = count;  // 分配唯一编号
    }

    // 仅包含名字的构造函数
    public Person(String name) {
        this.name = name;
        count++;  // 递增静态计数器
        this.personNumber = count;  // 分配唯一编号
    }

    // Getter 方法
    public String getName() {
        return this.name;
    }

    public String getGender() {
        return this.gender;
    }

    public String getCity() {
        return this.city;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public int getIdNumber() {
        return this.idNumber;
    }

    public int getPersonNumber() {
        return this.personNumber;
    }

    // 比较两个人是否相同，基于名字、性别和 idNumber
    public boolean samePerson(Person that) {
        if (!this.name.equals(that.getName())) {
            return false;
        } else if (!this.gender.equals(that.getGender())) {
            return false;
        } else {
            return this.idNumber == that.getIdNumber();
        }
    }

    // 返回对象字符串表示
    public String toString() {
        return "Person: name=" + this.name + ", gender= " + this.gender + ", city=" + this.city + ", idNumber=" + this.idNumber + ", personNumber=" + this.personNumber;
    }

    // 打印城市
    public void hello() {
        System.out.println(city);
    }

    // 静态方法返回创建的总对象数量
    public static int getCount() {
        return count;
    }
}


public class PersonProject {
    public static void main(String[] args) {
        // 创建 Person 对象
        Person p1 = new Person("James Bond", "M", "London", "1921-11-11", 7);
        Person p2 = new Person("James Bond", "M", "London", "1921-11-11", 7);
        Person p3 = new Person("jack1111");  // 第二个构造函数

        // 每个对象都有自己的编号
        System.out.println("p1's personNumber: " + p1.getPersonNumber());
        System.out.println("p2's personNumber: " + p2.getPersonNumber());
        System.out.println("p3's personNumber: " + p3.getPersonNumber());

        // 总的 Person 对象数量
        System.out.println("Total number of Person objects created: " + Person.getCount());
        System.out.println(p1.samePerson(p2));
        System.out.println(p1);
    }
}
```

# 

```         
```

```         
Public class Solution{
         Public static void main(String args[]){
                 Int i;
                 for(i = 1; i < 6; i++){ 
                     if(i > 3) continue;
                 }
                 System.out.println(i);
          }
}
```

```         

int result = 5;
int newValue = result++; // newValue = 5, result = 6
```

```         
int result = 5;
int newValue = ++result; // newValue = 6, result = 6
```

``` java
public class Fibonacciarray{
  int n;
  int [] hi;
  
  public final1(int number){
    this.n=number;
    this.hi=new int[number];
  }
  
  public static void main(String[] args){
    final1 hii = new final1(8);
    hii.setHi(generatefinal1(8));
    System.out.println(hii);
  }
  
  public static int[] generatefinal1(int n){
    int[] resultArray = new int[n];
    resultArray[0]=0;
    if(n>1){
      resultArray[1]=1;
      
    }
    for(int i =2;i<n;i++){
      resultArray[i]=resultArray[i-1]+resultArray[i-2];
    }
    return resultArray;
  }
  
  public void setHi(int[] hi){
    this.hi=hi;
  }
  
  public StringtoString(){
    if(hi == null){
      ruturn "";
    }
    String result = "";
    for(int i = 0; i<hi.length;i++){
      result+=hi[i];
      if(i<hi.length-1){
        result +=" ";
      }
    }
  }return result;
}

```

# reference variable and primative data type

```         
public void changeValue(int num) { num = 20; }

int x = 10; changeValue(x); System.out.println(x); // Output: 10, x is unchanged
```

d

```         
public void changeColor(Car car) { car.color = "Blue"; }

Car myCar = new Car("Red"); changeColor(myCar); System.out.println(myCar.color); // Output: Blue
```

![](images/clipboard-2535361475.png)

# JVM

![](images/clipboard-286060493.png)

-   Stack: store the order of the method execution and local variables

    ```         
     - primitive type variables
    ```

-   heap memory stores the objects and it uses dynamic memory allocation and deallocaton

    ```         
    - the stack holds a pointer to the object on the heap. **reference type variable=another**--copy of only the pointer is made.
    ```

# primitives and objects

-   primitives do not have methods, which store an actual value and the variable holds that value

-   objects containing properties(variables) and behaviour(methods) have methods, which are reffered to by reference and the variable holds a memory address poingting to the object.

    -   Java objects have states and behaviour

![](images/clipboard-2442927869.png)

```         
 - Data object
 
         
         - classes in java
         
         
         
         
         A class is a template for objects.A class defines object properties. A class also describes object behavior.(objects, instances of the class, are in the main method)
              It is the constructor that allows our initial objects to be different when they are first created!
              
              
              
```

# local/instance variable

```         
public class Person {
    private String name; // 实例变量
    private int age;     // 实例变量

    public Person(String name, int age) { // name 和 age 是构造函数的局部变量
        this.name = name; // 将局部变量 name 的值赋给实例变量 name
        this.age = age;   // 将局部变量 age 的值赋给实例变量 age
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
```

name 和 age 是构造函数 Person(String name, int age) 的局部变量。 this.name 和 this.age 是 Person 类的实例变量。 构造函数通过 this.name = name; 和 this.age = age; 将局部变量的值赋给实例变量，以便在对象的生命周期内保持这些信息。

```         
public class MyClass {
    
    // 静态变量（类变量）
    private static int staticCount = 0;
    
    // 实例变量
    private int instanceCount = 0;

    // 静态方法（类方法） - 不加 private
    public static int getStaticCount() {
        return staticCount;
    }

    // 静态方法（类方法） - 使用 private 修饰
    private static void incrementStaticCount() {
        staticCount++;
    }

    // 实例方法 - 不加 private
    public int getInstanceCount() {
        return instanceCount;
    }

    // 实例方法 - 使用 private 修饰
    private void incrementInstanceCount() {
        instanceCount++;
    }

    // 公共方法，调用私有方法
    public void updateCounts() {
        incrementStaticCount();    // 调用静态的私有方法
        incrementInstanceCount();  // 调用实例的私有方法
    }
}
```

静态方法 getStaticCount(): 这是一个公共的类方法，用于返回 staticCount 的值。可以通过类名直接访问，例如 MyClass.getStaticCount()。 静态方法 incrementStaticCount(): 这是一个私有的静态方法，仅能在类内部调用。例如，可以通过 updateCounts() 方法在内部调用。 实例方法 getInstanceCount(): 这是一个公共的实例方法，用于返回 instanceCount 的值。必须通过实例对象来调用，例如 myObject.getInstanceCount()。 实例方法 incrementInstanceCount(): 这是一个私有的实例方法，仅能在类内部调用。只能在 updateCounts() 方法中使用。 公共方法 updateCounts(): 这是一个公共方法，可以访问类内部的私有方法 incrementStaticCount() 和 incrementInstanceCount()。此方法可以由类的实例调用。

```         
public class Test {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        // 调用公共静态方法
        System.out.println("Static Count: " + MyClass.getStaticCount());

        // 调用公共实例方法
        System.out.println("Instance Count: " + myObject.getInstanceCount());

        // 更新计数值
        myObject.updateCounts();

        // 再次查看计数值
        System.out.println("Static Count after update: " + MyClass.getStaticCount());
        System.out.println("Instance Count after update: " + myObject.getInstanceCount());
    }
}
```

```         
Static Count: 0
Instance Count: 0
Static Count after update: 1
Instance Count after update: 1
```

```         
public class User {
    // 私有变量：默认设为私有，只有类内部可以访问
    private String username;
    private String password;

    // 公有构造方法：需要从其他类访问创建实例，因此设为 public
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // 私有方法：用于验证密码，只在类内部使用
    private boolean isValidPassword(String password) {
        // 仅在此类内部进行密码验证逻辑
        return password.length() >= 8;
    }

    // 公共方法：允许从外部访问，检查密码是否合法
    public boolean checkPassword(String password) {
        return isValidPassword(password);
    }

    // 公共方法：获取用户名
    public String getUsername() {
        return username;
    }

    // 公共方法：设置新密码，带有验证逻辑
    public boolean setPassword(String newPassword) {
        if (isValidPassword(newPassword)) {
            this.password = newPassword;
            return true;
        } else {
            System.out.println("密码长度必须至少8位！");
            return false;
        }
    }
}
```

```         
public class TestUser {
    public static void main(String[] args) {
        // 创建 User 对象实例
        User user = new User("Alice", "password123");

        // 获取用户名
        System.out.println("用户名: " + user.getUsername());

        // 尝试设置新密码
        if (user.setPassword("newpass")) {
            System.out.println("密码设置成功！");
        } else {
            System.out.println("密码设置失败！");
        }
    }
}
```

```         
用户名: Alice
密码长度必须至少8位！
密码设置失败！
```

```         
public class Person {
    // 静态变量，所有实例共享
    private static String name;

    public Person(String name) {
        // 设置静态变量的值，这会影响所有实例
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

```         
public class Person {
    // 实例变量，每个实例独立拥有
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

```         
public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Bruce Lee");
        Person person2 = new Person("Jackie Chan");

        System.out.println("Person 1's name: " + person1.getName()); // 输出: Bruce Lee
        System.out.println("Person 2's name: " + person2.getName()); // 输出: Jackie Chan
    }
}
```

```         
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 覆盖 toString 方法，以便输出 Person 对象的信息
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class TestPersonArray {
    public static void main(String[] args) {
        // 创建两个 Person 对象
        Person p1 = new Person("Bruce Lee", 32);
        Person p2 = new Person("Jackie Chan", 65);

        // 创建 Person 类型的数组
        Person[] people = new Person[2];
        people[0] = p1;
        people[1] = p2;

        // 打印数组对象的引用（未格式化的输出）
        System.out.println("Array reference: " + people);

        // 使用 toString 方法逐个输出数组中的对象
        System.out.println("Array contents:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
```

## Some for-loop practice 


## class-buliding practice
