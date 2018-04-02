<?php
if (isset($_GET['ida']))
{
	include_once 'funct/db.php';
	include_once 'funct/DaddID.class.php';
	$database 						= new Database();
	$db 							= $database->getConnection();
	$DaddID 						= new DaddID($db);
	$DaddID->value 				= $_GET['ida'];
	if($DaddID->addID())							// create the product
	{
		include_once 'funct/aw.json.php';
	}
}
?>