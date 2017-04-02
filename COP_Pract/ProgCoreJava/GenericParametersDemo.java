import java.util.List;
import java.util.ArrayList;
public class GenericParametersDemo{
		public static void main(String[] args){
			//Machine machineObj = new Machine();
			GenericParametersDemo genObj = new GenericParametersDemo();
			//genObj.printMachine(machineObj);
						
			//can't pass child class objects coz child cls methods wont be visible to parent cls
			//Camera camObj = new Camera();
			//genObj.printMachine(camObj);
			
			List<Machine> anyList = new ArrayList<>();
			Machine mcObj = new Machine();
			anyList.add(mcObj);
			Camera camObj = new Camera();
			anyList.add(camObj);
			//genObj.printAny(anyList);
			//genObj.printMachineUpperBound(anyList);
			genObj.printMachineLowerBound(anyList);
		}
		
		//Declaring Only Machine Type Parameter
		public void printMachine(Machine machine){
			machine.start();
			
			//won;t be visible to Machine
			//machine.snap();
		}
		
		//Declaring any Object Type Parameter
		public void printAny(List<?> list){
			for(Object obj : list){			
			//since any obj type can be passed, we need to explicitly type cast the objects 
			//to our desired type and then the methods of only this type can be accessed.
			
			/***if(obj instanceof Machine){
				Machine machine = (Machine)obj;
				machine.start();
			}else{**/
				Camera camera = (Camera)obj;
				camera.start();
				camera.snap();
			//}
			}
		}
		
		//Declaring an upper bound
		public void printMachineUpperBound(List<? extends Machine> list){
			for(Machine mcObj : list){
			
			//any obj type of Machine cls or its child can be passed since due to dynamic polymorphism
			//we can pass a child cls obj wherever a parent cls is expected. We don't need to typecast
			//and can use parent cls reference for any obj passed. Only parent cls methods are visible.
				mcObj.start();
			}
		}
		
		//Declaring a lower bound
		public void printMachineLowerBound(List<? super Machine> list){
			for(Object obj : list){
		
			//any obj type of Camera cls or its super cls upto Object can be passed. we need to explicitly type cast the objects 
			//to our desired type and then access its methods. Camera has access to all the methods untill
			//object and they can b accessed if camera obj is passed. If type other  than camera is
			//passed then only its methods and above the chain can be called
			Machine machine = (Machine)obj;
			machine.start();
			}
		}
}