package homeAssignmentJune8;

public class ExecutionClass extends Button {
	public void execcode()
	{
		System.out.println("Code executed");
	}
	public static void main(String[] args) {
		ExecutionClass exe=new ExecutionClass();
		//calls methods from button, web element
			exe.execcode();
			exe.click();
			exe.setText("123");
				}		
	}

