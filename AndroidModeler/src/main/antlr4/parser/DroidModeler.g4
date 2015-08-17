grammar DroidModeler;

appDefinition
:
	'app' name = ID
	(
		'minSDK=' minSDK = NUMBER
	)?
	(
		'targetSDK=' targetSDK = NUMBER
	)? LBRACE packageDefinition
	(
		componentDefinition
		| featureDefinition
	)+ RBRACE
;

serverAppDefinition
:
	'serverapp' name = ID
	(
		'minSDK=' minSDK = NUMBER
	)?
	(
		'targetSDK=' targetSDK = NUMBER
	)? LBRACE packageDefinition
	(
		componentDefinition
		| featureDefinition
	)+ RBRACE
;

packageDefinition
:
	'pkg' name = ID
;

componentDefinition
:
	(
		activityDefinition
		| serviceDefinition
		| broadcastReceiverDefinition
		| topicDefinition
		| groupDefinition
	)+
;

activityDefinition
:
	'activity' name = ID
;

serviceDefinition
:
	'service' name = ID
;

broadcastReceiverDefinition
:
	'bcreceiver' name = ID
;

topicDefinition
:
	'topicmanager' name = ID
;

groupDefinition
:	
	'groups' name = ID
;

messageDefinition
:
	'message' name = ID
;

featureDefinition
:
	gcmFeatureDefinition
	| gcmServerFeatureDefinition
;

gcmFeatureDefinition
:
	'gcm' LBRACE
	(
		activityDefinition
		| serviceDefinition
		| broadcastReceiverDefinition
		| topicDefinition
		| groupDefinition
	)+ RBRACE
;

gcmServerFeatureDefinition
:
	'gcmserver' LBRACE
	(
		messageDefinition
		| topicDefinition
		| groupDefinition
	)+ RBRACE
;

ID
:
	[.a-zA-Z]+
;

NUMBER
:
	[1-9] [0-9]*
;

LBRACE
:
	'{'
;

RBRACE
:
	'}'
;

WS
:
	[ \t\r\n]+ -> skip
;  