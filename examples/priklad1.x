def main -> Int = {

	var n: Int = readInt();
	var maxi: Int = readInt();

	for(i <- 0 to n-1){
		var x: Int = readInt();
		if maxi < x -> { maxi = x; }
	}

	printiln(maxi);
	
	return 0;
}