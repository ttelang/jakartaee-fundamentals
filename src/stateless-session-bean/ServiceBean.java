@Stateless
@TransactionAttribute(NEVER)
@ExcludeDefaultInterceptors
public class ServiceBean implements Service
{
     public void sayHello () {
        System.out.println("Hello World!");
     }
}
