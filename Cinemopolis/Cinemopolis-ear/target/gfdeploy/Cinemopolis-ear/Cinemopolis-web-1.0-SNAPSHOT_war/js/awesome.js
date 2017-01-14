



var client = new $.RestClient('/rest/api/');

client.add('movie');
client.foo.read().done(function (data) {
    alert('I have data: ' + data);
});