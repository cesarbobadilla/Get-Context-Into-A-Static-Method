<?php
$item_type 	= "5154msgnotificationthis is a pushmsg test";
$post_data 	= array	(
				'main' => array(
					'temp' => $item_type
								)
					);
$myJSON 	= json_encode($post_data);
echo $myJSON;
?>