import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class Server {
	
	//http://localhost:8686/BanqueWS?wsdl
	
    public static void main(String[] args) {
    	String url = "http://0.0.0.0:8686/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("Web service déployé sur " + url);
    }
}
