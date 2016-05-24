package br.com.fiap.listener;

import java.io.FileWriter;
import java.util.Date;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class ListenerAplicacao implements ServletContextListener,
	HttpSessionListener, 
	HttpSessionAttributeListener,
	ServletRequestAttributeListener {

    public ListenerAplicacao() {
        // TODO Auto-generated constructor stub
    }

    public void sessionCreated(HttpSessionEvent arg0)  { 
         gerarLog("Sess�o criada");
    }

    public void attributeRemoved(ServletRequestAttributeEvent arg0)  { 
         gerarLog("Atributo removido da sess�o");
    }

    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         gerarLog("Sess�o finalizada");
    }

    public void contextDestroyed(ServletContextEvent arg0)  { 
         gerarLog("Aplica��o finalizada");
    }

    public void attributeAdded(ServletRequestAttributeEvent arg0)  { 
        String s = (String)arg0.getServletRequest().getAttribute("msg");
        if(s != null){
        	gerarLog("Atributo '" + s +"' adicionado na requisi��o");
        }
        else{
        	gerarLog("Atributo adicionado na requisi��o");
        }
    }

    public void attributeReplaced(ServletRequestAttributeEvent arg0)  { 
    	String s = (String)arg0.getServletRequest().getAttribute("msg");
        if(s != null){
        	gerarLog("Atributo '" + s +"' atualizado na requisi��o");
        }
        else{
        	gerarLog("Atributo atualizado na requisi��o");
        }
    }

    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
         gerarLog("Atributo adicionado � sess�o");
    }

    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
         gerarLog("Atributo removido da sess�o");
    }

    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
    	gerarLog("Atributo atualizado na sess�o");
    }

    public void contextInitialized(ServletContextEvent arg0)  { 
         gerarLog("Aplica��o iniciada");
    }
	
    private void gerarLog(String texto){
    	try {
			FileWriter arquivo = new FileWriter("D:/27scj/JavaWeb/log.txt", true);
			arquivo.write("[" + new Date() + "] - " + texto +  "\r\n");
			arquivo.close();
		} catch (Exception e) {
			
		}
    }
}
