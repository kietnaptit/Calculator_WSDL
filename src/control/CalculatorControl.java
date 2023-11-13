package control;

import java.lang.reflect.Parameter;
import javax.xml.rpc.ParameterMode;
import model.Calculator;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;



public class CalculatorControl {
    public CalculatorControl(){
        
    }
    private String calculate(String methodName, Calculator cal){
        String result = "";
        String endpointURL = "http://localhost:8080/axis/Calculators.jws";
        Service service = new Service();
        try{
            Call call = (Call) service.createCall();
            call.setTargetEndpointAddress(new java.net.URL(endpointURL));
            call.setOperationName(methodName);
            call.addParameter("a", XMLType.XSD_DOUBLE, ParameterMode.IN);
            call.addParameter("b", XMLType.XSD_DOUBLE, ParameterMode.IN);
            call.setReturnType(XMLType.XSD_STRING);
            result = (String)call.invoke(new Object[]
                                            {cal.getFirstNumber(),cal.getSecondNumber()});            
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
    public String multiple(Calculator cal){
        String result = null;
        try{
            result = calculate("Mul", cal);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
        return result;
    }
    public String div(Calculator cal){
        String result = null;
        try{
            result = calculate("Div", cal);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
        return result;
    }
    public String add(Calculator cal){
        String result = null;
        try{
            result = calculate("Add", cal);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
        return result;
    }
    public String sub(Calculator cal){
        String result = null;
        try{
            result = calculate("Sub", cal);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
        return result;
    }
    
}
