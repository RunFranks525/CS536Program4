public class SemSym {
    private String type;
    
    public SemSym(String type) {
        this.type = type;
    }
    
    public String getType() {
        return type;
    }
    
    public String toString() {
        return type;
    }
}

public class StructSym extends SemSym{
	@Override
	private HashMap<String, SemSym> fields;
	
	public StructSym(String type) {
		this.type = type;
		fields = new HashMap<String, SemSym>();
	}

	public void addField(String name, SemSym symbol){
		fields.put(name, symbol);
	}
	
	public Boolean contains(String name){
		if(fields.containsKey(name))
			return true;
		else
			return false;
	}
}


public class FuncSym extends SemSym{

	private ArrayList<SemSym> args;

	public FuncSym(String type){
		this.type = type;
		args = new List<String, SemSym>();
	}
	
	public void addArg(SemSym symbol){
		args.add(symbol);
	}

	public int numArgs(){
		return args.size();
	}

	public ArrayList<SemSym> getArgs(){
		return args;
	} 
	


}
