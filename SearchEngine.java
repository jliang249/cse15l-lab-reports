import java.io.IOException;
import java.net.URI;

class SearchEngine implements NumberServer {
    String s ="";


    public String handleRequest(URI url){
        if(url.getPath().contains("/add")){
            String[] parameters = url.getQuery().split("=");
            if(parameters[0].equals("s")){
                s += (" ") += String.parseStr(parameters[1]);
                return String.format("The word %s is added! It's now %d",parameters[1], s );
            }
        }
        else if (url.getPath().contains("/search")){


        }
        else{
            return "404 Not Found!";
        }
    }   
}

