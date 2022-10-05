package C2Prolem3;

import java.util.Objects;


public class Student {

		private int id;
		private String name;
		private int marks;
		private String address;
		public Student(int id, String name, int marks,String address) {
			super();
			this.id = id;
			this.name = name;
			this.marks = marks;
			this.address = address;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}
		
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		@Override
		public int hashCode() {
			return Objects.hash(id);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			return id == other.id;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", marks=" + marks +  ", address= " + address + "]";
		}
		
		
	
}


