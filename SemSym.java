import java.util.*;

public class SemSym {
    protected String type;

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

class StructSym extends SemSym{

	private SymTable fields;

	public StructSym(String type) {
		super(type);
		fields = new SymTable();
	}

	public SymTable getSymTable(){
		return fields;
	}

}


class FuncSym extends SemSym{

	private ArrayList<SemSym> args;

	public FuncSym(String type) {
    super(type);
		args = new ArrayList<SemSym>();
	}

	public void addArg(SemSym symbol) {
		args.add(symbol);
	}

	public int numArgs(){
		return args.size();
	}

	public ArrayList<SemSym> getArgs(){
		return args;
	}



}
