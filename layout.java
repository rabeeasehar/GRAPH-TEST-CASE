	for (Iterator<? extends Reference> it = refs.iterator(); 
it.hasNext();) {
	Reference ref = it.next();	           
	String name = ReferenceUtil.getReferenceString(ref);	           
	Matcher m = filterPattern.matcher(name);	           
        if (!m.find()) {	          
             
	}}