package yybb;
import com.jacob.activeX.ActiveXComponent;  
import com.jacob.com.Dispatch;  
import com.jacob.com.Variant;  
  
public class Test04 {  
    public static void main(String[] args) {  
//    	System.out.println("456");
         ActiveXComponent sap = new ActiveXComponent("Sapi.SpVoice");    
            try {    
                // ���� 0-100    
                sap.setProperty("Volume", new Variant(100));    
                // �����ʶ��ٶ� -10 �� +10    
                sap.setProperty("Rate", new Variant(-2));    
                // ��ȡִ�ж���    
                Dispatch sapo = sap.getObject();    
                // ִ���ʶ�    
                Dispatch.call(sapo, "Speak", new Variant("�Լ���"));    
                // �ر�ִ�ж���    
                sapo.safeRelease();    
            } catch (Exception e) {    
                e.printStackTrace();    
            } finally {    
                // �ر�Ӧ�ó�������    
                sap.safeRelease();    
            }    
    }  
}  

