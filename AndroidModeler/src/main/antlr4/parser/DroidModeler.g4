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
	'groups' name = FLAG
;

featureDefinition
:
	gcmFeatureDefinition
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

ID
:
	[.a-zA-Z]+
;

NUMBER
:
	[1-9] [0-9]*
;

FLAG
:
	'true'
	| 'false'
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