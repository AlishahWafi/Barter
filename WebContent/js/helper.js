//set
function setStore(Key, Value){
	localStorage.setItem(Key, Value);
}
//get
function getStore(Key){
	return (localStorage.getItem(Key));
}