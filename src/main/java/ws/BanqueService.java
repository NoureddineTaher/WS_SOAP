package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "ConversionEurToDT")
    public double conversion(@WebParam(name = "montant") double mt){
        return mt*3.4;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") Long code){
        return new Compte(code,Math.random()*90000,new Date());
    }
    @WebMethod
    public List<Compte> listCompte(){
    	
    	List<Compte> comptes = new ArrayList<>();
    	comptes.add(new Compte(1L,Math.random()*90000,new Date()));
    	comptes.add(new Compte(2L,Math.random()*90000,new Date()));
    	comptes.add(new Compte(3L,Math.random()*90000,new Date()));
    	
		return comptes;
    }
}
