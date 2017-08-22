struct Node{
	vector<Node*> sons;
};

void dfsFind(Node *node,int dep,int counter[]){
	counter[dep]++;
	
	for(int i=0;i<node.sons.size();i++){
		dfsFind(node.sons[i],dep+1,counter);
	}
}

int find(Node*root,int maxDep){
	int depCounter[100000];
	dfsFind(root,0,depCounter);
	
	int max,Dep;
	max=1;
	for(int i=maxDep;i>=1;--i){
		if(depCounter[i]>=max){
			max=depCounter[i];
			Dep=i;
		}
	}
	return Dep;
}
