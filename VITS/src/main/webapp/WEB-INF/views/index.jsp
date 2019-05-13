<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Creating Twitter Typeahead using Local Data</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script  type="text/javascript" src="http://twitter.github.io/typeahead.js/releases/latest/typeahead.bundle.js"></script>
<script type="text/javascript">
$(document).ready(function(){
    // Defining the local dataset
    var cars = ['Until he extends the circle of his compassion to all living things',
    	' man will not himself find peace',
    	'Albert Schweitzer, early 20th-century German Nobel Peace Prize-winning mission doctor and theologian',
   			
    	'First they came for the communists', 
    	'and I did not speak out—because I was not a communist' ,
    	'Then they came for the socialists', 
    	'and I did not speak out—because I was not a socialist',
    	'Then they came for the trade unionists', 
    	'and I did not speak out—because I was not a trade unionist',
    	'Then they came for the Jews, and I did not speak out—because I was not a Jew',
    	'Then they came for me—and there was no one left to speak out for me.',
    	'Pastor Martin Niemöller',
    	'I and the public know',
    	'what all schoolchildren learn ',
    	'Those to whom evil is done',
    	' do evil in return',

    	'Let us not wallow in the valley of despair',
    	'I say to you today, my friends',
    	 'And so even though we face the difficulties of today and tomorrow'
    	 , 'I still have a dream', 
    	 'It is a dream deeply rooted in the American dream' ,
    	 'I have a dream that one day this nation will rise up and live out the true meaning of its creed',
    	 'We hold these truths to be self-evident', 
    	 'that all men are created equal', 
    	 'I have a dream that one day on the red hills of Georgia', 
    	 'the sons of former slaves and the sons of former slave owners will be able to sit down together at the table of brotherhood' ,
    	 'I have a dream that one day even the state of Mississippi', 
    	 'a state sweltering with the heat of injustice', 
    	 'sweltering with the heat of oppression',
    	 'will be transformed into an oasis of freedom and justice' ,
    	 'I have a dream that my four little children will one day live in a nation where they will not be judged by the color of their skin but by the content of their character' ,
    	 'I have a dream today',
    	 'I have a dream that one day',
    	 'down in Alabama, with its vicious racists',
    	 
    	 ];
    
    // Constructing the suggestion engine
     var cars = new Bloodhound({
        datumTokenizer: Bloodhound.tokenizers.whitespace,
        queryTokenizer: Bloodhound.tokenizers.whitespace,
        local: cars
    }); 
    
    // Initializing the typeahead
    $('.input').typeahead({
        hint: true,
        highlight: true, /* Enable substring highlighting */
        minLength: 1 /* Specify minimum characters required for showing result */
    },
    {
        name: 'cars',
        source: cars
    });
});  
</script>
<style type="text/css">
.bs-example {
	font-family: sans-serif;
	position: relative;
	margin: 100px;
}
.typeahead, .tt-query, .tt-hint {
	border: 2px solid #CCCCCC;
	border-radius: 8px;
	font-size: 22px; /* Set input font size */
	height: 30px;
	line-height: 30px;
	outline: medium none;
	padding: 8px 12px;
	width: 396px;
}
.typeahead {
	background-color: #FFFFFF;
}
.typeahead:focus {
	border: 2px solid #0097CF;
}
.tt-query {
	box-shadow: 0 1px 1px rgba(0, 0, 0, 0.075) inset;
}
.tt-hint {
	color: #999999;
}
.tt-menu {
	background-color: #FFFFFF;
	border: 1px solid rgba(0, 0, 0, 0.2);
	border-radius: 8px;
	box-shadow: 0 5px 10px rgba(0, 0, 0, 0.2);
	margin-top: 12px;
	padding: 8px 0;
	width: 422px;
}
.tt-suggestion {
	font-size: 22px;  /* Set suggestion dropdown font size */
	padding: 3px 20px;
}
.tt-suggestion:hover {
	cursor: pointer;
	background-color: #0097CF;
	color: #FFFFFF;
}
.tt-suggestion p {
	margin: 0;
}
</style>
</head>
<body>
    <div class="bs-example">
		<h2>Type your favorite car name</h2>
        <input type="text" class="input tt-query" autocomplete="off" spellcheck="true">
    </div>
</body>
</html>                                                        