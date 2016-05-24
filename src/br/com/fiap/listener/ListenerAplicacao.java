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
         gerarLog("Sessão criada");
    }

    public void attributeRemoved(ServletRequestAttributeEvent arg0)  { 
         gerarLog("Atributo removido da sessão");
    }

    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         gerarLog("Sessão finalizada");
    }

    public void contextDestroyed(ServletContextEvent arg0)  { 
         gerarLog("Aplicação finalizada");
    }

    public void attributeAdded(ServletRequestAttributeEvent arg0)  { 
        String s = (String)arg0.getServletRequest().getAttribute("msg");
        if(s != null){
        	gerarLog("Atributo '" + s +"' adicionado na requisição");
        }
        else{
        	gerarLog("Atributo adicionado na requisição");
        }
    }

    public void attributeReplaced(ServletRequestAttributeEvent arg0)  { 
    	String s = (String)arg0.getServletRequest().getAttribute("msg");
        if(s != null){
        	gerarLog("Atributo '" + s +"' atualizado na requisição");
        }
        else{
        	gerarLog("Atributo atualizado na requisição");
        }
    }

    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
         gerarLog("Atributo adicionado à sessão");
    }

    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
         gerarLog("Atributo removido da sessão");
    }

    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
    	gerarLog("Atributo atualizado na sessão");
    }

    public void contextInitialized(ServletContextEvent arg0)  { 
         gerarLog("Aplicação iniciada");
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
