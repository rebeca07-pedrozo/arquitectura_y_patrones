const AWS = require('aws-sdk');
const dynamodb = new AWS.DynamoDB.DocumentClient();

exports.handler = async (event) => {
    const body = JSON.parse(event.body);
    const { nombre, correo, mensaje } = body;

    const params = {
        TableName: 'ComentariosClientes',
        Item: {
            id: Date.now().toString(),
            nombre,
            correo,
            mensaje,
            timestamp: new Date().toISOString()
        }
    };

    try {
        await dynamodb.put(params).promise();
        return {
            statusCode: 200,
            body: JSON.stringify({ mensaje: 'Comentario recibido con éxito.' })
        };
    } catch (error) {
        return {
            statusCode: 500,
            body: JSON.stringify({ error: 'Error al guardar el comentario' })
        };
    }
};
