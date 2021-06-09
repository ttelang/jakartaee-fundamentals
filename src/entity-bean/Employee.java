@Entity
@Table(name = "Employee")
public class Employee {
      @Id
      @Column(name = "empId")
      @GeneratedValue(strategy = GernationType.Auto)
      private Long id;
      private String name;
      private String email;
      
      private Set<Project>  projects = new HashSet<>();
      
      @NotNull 
      @Email
      public String getEmail()      { 
          return email;
      }

      @ManyToMany
      public Set<Project> getProjects() { return projects; }
      …
  }
