package calculator;

import java.util.HashMap;

public class Scope {
    Scope parent;
    HashMap<String, Double> variables;
    boolean isGlobalScope;

    public Scope(Scope parent, boolean isGlobalScope){
        this.parent = parent;
        this.isGlobalScope = isGlobalScope;
        this.variables = new HashMap<String, Double>();
    }

    public HashMap<String, Double> getVariables(){
        return this.variables;
    }

    public Scope getParentScope(){
        return this.parent;
    }

    public boolean isGlobal(){
        return this.isGlobalScope;
    }

    public Double getVariable(String varName){
        Scope temp = this;
        
        while(temp.getVariables().containsKey(varName) == false){
            if(temp.isGlobal()){
                return null;
            }
            temp = temp.getParentScope();
        }
        return temp.getVariables().get(varName);
    }
}