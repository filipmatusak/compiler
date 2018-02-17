def main -> Int = {

	var n: Int = readInt();
	var g: Int[n][n];

	for(i <- 0 to n, j <- 0 to n){
		g[i][j] = readInt();
	}

	for(l <- 0 to n,
		k <- 0 to n,
		m <- 0 to n){

		var d: Int = g[k][l] + g[l][m];
		if g[k][l] > 0 && g[l][m] > 0 && (g[k][m] < 0 || g[k][m] > d) -> {
			g[k][m] = d;
			g[m][k] = d;
		}
	}

	for(ii <- 0 to n){
		for(jj <- 0 to n){
			printi(g[ii][jj]);
			prints(" ");
		}
		printsln("");
	}
	
	return 0;
}
