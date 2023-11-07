# ***CÁCH JAVA LƯU TRỮ DỮ LIỆU***

## 1. Cách  Java lưu trữ dữ liệu

Trong Java, kiểu dữ liệu được chia làm 2 loại: 
* Kiểu dữ liệu nguyên thủy
* Kiểu dữ liệu Object

>Để phân biệt 2 kiểu dữ liệu trên có thể kiểm tra tên của chúng. Kiểu nguyên thủy bắt đầu bằng **chữ thường**, kiểu Object bắt đầu bằng **chữ hoa**.
### 1.1. Kiểu dữ liệu nguyên thủy
- Có 8 kiểu dữ liệu nguyên thủy trong Java: **byte, char, short, int, long, float, double và boolean**

>Cách lưu trữ của kiểu dữ liệu: Giá trị là các kiểu dữ liệu cơ sở.
### 1.2. Kiểu dữ liệu Object
- Là kiểu dữ liệu không nguyên thuỷ, chúng chỉ đến các Object. Các ví dụ của kiểu dữ liệu này là: **Array, String, Class, Interface**

>Cách lưu trữ của kiểu dữ liệu: Kiểu dữ liệu đối tượng: Giá trị là địa chỉ của đối tượng.

### 1.3. Class Object
![[Pasted image 20231107003617.png]]

Mặc định lớp Object là lớp cha của tất cả các lớp trong Java.

Sử dụng lớp Object là hữu ích nếu bạn muốn tham chiếu bất kỳ đối tượng nào mà bạn chưa biết kiểu dữ liệu của đối tượng đó.

**Ví dụ**: Phương thức getObject trả về một Object với kiểu dữ liệu bất kì. Chúng ta có thể sử dụng biến tham chiếu của lớp Object để tham chiếu tới đối tượng đó.
```Java
Object obj = getObject();
```
#### ***Class getClass()***
\- Phương thức này trả về lớp `Class`. Từ lớp Class đó có thể lấy được các thông tin metadata của class hiện tại.
```Java
System.out.println(obj.getClass())
```

>class java.lang.Object

#### ***int hashCode()***

\- Trả về giá trị hash code cho đối tượng

```Java
System.out.println(obj.hashCode())
```
#### ***boolean equals(Object obj)***
\- So sánh đối tượng đã cho với đối tượng hiện tại.
```Java
System.out.println(obj.equals(obj1));
```

#### ***Object clone()***
\- Phương thức này giúp khởi tạo và trả về một bản sao của đối tượng được gọi. 
```Java
Object obj1= obj.clone();
```
### 1.4 Lớp Wrapper, Boxing, Unboxing

\- Lớp Wrapper trong java cung cấp cơ chế để chuyển đổi kiểu dữ liệu nguyên thủy thành kiểu đối tượng và từ đối tượng thành kiểu dữ liệu nguyên thủy.

| **Kiểu nguyên thủy** | **Kiểu Wrapper** |
| -------------------- | ---------------- |
| boolean              | Boolean          |
| char                 | Character        |
| byte                 | Byte             |
| short                | Short            |
| int                  | Integer          |
| long                 | Long             |
| float                | Float            |
| double               | Double           |

#### ***Chuyển đổi kiểu nguyên thủy sang kiểu Wrapper***

- **Boxing** là việc chuyển đổi một kiểu nguyên thủy sang kiểu Wrapper.

```Java
//Boxing
Integer i = new Integer(100);
Float f = new Float(4.5);
```

- **Autoboxing** là quá trình mà trình biên dịch của Java tự động chuyển đổi giữa kiểu dữ liệu cơ bản (**Primitive type**) về đối tượng tương ứng với lớp (**Wrapper class**) của kiểu dữ liệu đó
```Java
//Autoboxing
Integer i = 100;
Float f = 2.0f;
```

#### ***1.4.2. Chuyển đổi kiểu Wrapper thành kiểu dữ liệu nguyên thủy***
- **Unboxing** là khi chuyển từ một kiểu Wrapper sang kiểu nguyên thủy của nó.

```Java
//Unboxing
Integer i = 100;
int i2 = i.intValue();
```
## 2. Các phương thức khởi tạo
### 2.1 Từ khóa this
- Từ khoá this được sử dụng để tham chiếu tới biến và phương thức của lớp hiện tại
Ví dụ:
```Java
public class Student{
    String name;
    String age;
    public confirm(){
	    System.out.println("Constructed");
	}
    public Student(String name, String age){
	    //Tham chiếu biến
        this.name=name;
        this.age=age;
		//Tham chiếu phương thức
		this.confirm();
    }
    public Student getStudent(){
	    //Trả về Object hiện tại
        return this;
    }
}
```
### **2.2 Tác dụng của từ khoá super:**

#### ***Tham chiếu đến biến trực tiếp của lớp cha***

```Java
class Vehicle{
    int age = 0;
    public void start(){
        System.out.println("Vrooomm");
    }
	public void getAge(){
        System.out.println(age);
    }
}

public class Car extends Vehicle{
    int speed = 100;
    int getAgeInMonth(){
        return super.age*12;
    }
    public static void main(String args[]){
        Car b = new Car();
        int month = b.getAgeInMonth();
    }
}
```
#### ***Gọi đến phương thức của lớp cha gần nhất***

```Java
class Vehicle{
    int age = 0;
    public void start(){
        System.out.println("Vrooomm");
    }
	public void getAge(){
        System.out.println(age);
    }
}

public class Car extends Vehicle{
    int speed = 100;
    void start(){
	    super.start();
    }
    public static void main(String args[]){
        Car b = new Car();
        b.start();
    }
}
```
## 3. Garbage Collection trong Java
- Garbage collection (Quá trình thu gom rác) trong máy ảo Java là quá trình xác định và loại bỏ các Object không được sử dụng khỏi bộ nhớ Heap.

**Ưu điểm của Garbage Collection**
- Nó làm cho việc sử dụng bộ nhớ java hiệu quả bởi vì bộ thu gom rác loại bỏ các đối tượng không được tham chiếu.
- Nó được thực hiện tự động vì vậy chúng ta không cần phải nỗ lực nhiều để giải phóng bộ nhớ.
## 4. Pass by value trong Java là gì?

- Pass by value là khi truyền vào phương thức giá trị chứ không phải là tham chiếu
**Ví dụ**
```Java
public class Main {
    public static void modify(int x, int y) {
        x = 100;
        y = 200;
        System.out.println("X - Y from modidy: " + x + " - " + y);
    }
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        System.out.println("X - Y before modidy: " + x + " - " + y);
        
        modify(x, y);

        System.out.println("X - Y after modidy: " + x + " - " + y);
    }

}
```

```Java
X – Y before modidy: 1 – 2  
X – Y from modidy: 100 – 200  
X – Y after modidy: 1 – 2
```