<?php
class Database
{
    private $host 		= "fill it with your host";
    private $db_name 	= "fill it with your datbase";
    private $username 	= "fill it with your username";
    private $password 	= "fill it with your password";
    public $conn;

    public function getConnection()
	{
        $this->conn 	= null;
        try
		{
			$this->conn = new PDO("mysql:host=" . $this->host . ";dbname=" . $this->db_name, $this->username, $this->password);
        }
		catch(PDOException $exception)
		{
			echo "Connection error: " . $exception->getMessage();
        }
        return $this->conn;
    }
}
?>