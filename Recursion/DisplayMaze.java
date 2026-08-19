import java.util.ArrayList;
import java.util.List;

public class DisplayMaze {
	public static void main(String[] args) {

		System.out.println(maze("",3,3));

	}

  static ArrayList<String> maze(String p,int r, int c){

		if(r==1 && c==1){
			ArrayList<String> list = new ArrayList<>();
       list.add(p);
			 return list;
		}

		ArrayList<String> list = new ArrayList<>();

		if(r>1){
			list.addAll(maze(p+"D", r-1, c));
		}
		if(c>1){
			list.addAll(maze(p+"R",r,c-1));
		}

		return list;
	}
}
