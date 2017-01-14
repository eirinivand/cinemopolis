



var client = new $.RestClient('/rest/api/');

client.add('foo');
client.foo.read().done(function (data) {
    alert('I have data: ' + data);
});