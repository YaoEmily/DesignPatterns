
public class GeneralManager extends Manager {
	public GeneralManager(String name) {
		super(name);
	}
	@Override
	public void RequestApplication(Request request) {
		if(request.getRequestType()=="请假")
			System.out.println(name+":"+request.getRequestContent()
				+"数量"+request.getNumber()+"被批准");
		else if(request.getRequestType()=="加薪"&&request.getNumber()<=500)
			System.out.println(name+":"+request.getRequestContent()
			+"数量"+request.getNumber()+"被批准");
		else if(request.getRequestType()=="加薪"&&request.getNumber()>500)
			System.out.println(name+":"+request.getRequestContent()
			+"数量"+request.getNumber()+"再说吧");
	}
}
