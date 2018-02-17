def main -> Int = {

	var n: Int = readInt();
	var p: String[n];

	for(i <- 0 to n){
		p[i] = readString();
	}

	for(j <- 0 to n, k <- j+1 to n){
		if p[j] > p[k] -> {
			var tmp: String = p[j];
			p[j] = p[k];
			p[k] = tmp;
		}
	}

	for(m <- 0 to n){
		printsln(p[m]);
	}

	return 0;
}