<?php
class DaddID
{
	private $conn;
	private $table_name				= "dcontextinstatic";
	
    public  $id;
	public	$value;

	public function __construct($db){	$this->conn = $db;	}
	function addID()
	{
		$query 				= " INSERT INTO " . $this->table_name . "
								SET value=:value
								";
		$stmt 				= $this->conn->prepare($query);
         // posted values
        $this->value		= htmlspecialchars(strip_tags($this->value));
		// bind values
        $stmt->bindParam(":value", 			$this->value);
		
        if($stmt->execute()){	return true;	}else{	return false;	}		
	}
}
?>