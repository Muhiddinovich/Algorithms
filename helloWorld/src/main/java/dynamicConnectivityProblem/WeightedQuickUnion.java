package dynamicConnectivityProblem;

import java.util.SimpleTimeZone;

public class WeightedQuickUnion {
	private int[] id;

	public WeightedQuickUnion(int N) { // set id of each object to itself (N array accessed)
		id = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
		}
	}

	private int root(int i) { // chase parent pointers until reach root (depth of array accesses)

		while (i != id[i]) {
			i = id[i];
		}
		return i;
	}

//	public void union(int p, int q) { // change root of p to point to root of q
//		int i = root(p);
//		int j = root(q);
//		if (i == j) {
//			return;
//		}
//		if (sz[i] < sz[j]) {
//			id[i]=id[j];
//			sz[j]+=sz[i]
//		} else {
//			id[j]=id[i];
//			sz[i]+=sz[j]
//		}
//	}
}
