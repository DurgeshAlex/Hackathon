<!DOCTYPE html>
<html lang="en">
<head>
<!-- include libraries(jQuery, bootstrap) -->
<link href="http://netdna.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.css" rel="stylesheet">
<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.js"></script> 
<script src="http://netdna.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.js"></script> 

<!-- include summernote css/js -->
<link href="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.11/summernote.css" rel="stylesheet">
<script src="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.11/summernote.js"></script>
<script>
$(document).ready(function() {
	  $('#summernote').summernote({
		  
		  hint: {
		    words: ['apple', 'orange', 'watermelon', 'watermelon water' ,'watermelon water' ,'watermelon water' ,'watermelon water' ,'watermelon water' ,'watermelon water' ,'watermelon water' ,'watermelon water' ,'watermelon water' ,'watermelon water' ,'watermelon water' ,'watermelon','lemon'],
		    match: /\b(\w{1,})$/,
		    search: function (keyword, callback) {
		      callback($.grep(this.words, function (item) {
		    	  if(item.indexOf(keyword) != 0){
		    		  keyword = 'test';
		    	  }
		        return item.indexOf(keyword) === 0;
		      }));
		    }
		  }  
	  });
	});
</script>
</head>
<body>
<form method="post">
  <textarea id="summernote" name="editordata" spellcheck="true"></textarea>
</form>
</body>
</html>