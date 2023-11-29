var exec = require('cordova/exec');

var DeviceInfoPlugin = {
    getDeviceInfo: function(successCallback, errorCallback) {
        exec(successCallback, errorCallback, 'OSPlugin', 'getDeviceInfo', []);
    }
};

module.exports = DeviceInfoPlugin;
