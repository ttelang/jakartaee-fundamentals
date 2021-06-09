public class Employee {
   public String id;

   @JsonbProperty("emp-name")
   public String name;
   
   // this does not map to JSON
   @JsonbTransient
   public boolean isMarried =  true;
  
   @JsonbCreator
   public Employee(
   @JsonbProperty(("emp-id")  String id)
   {  
      this.id = id;
   }
}

