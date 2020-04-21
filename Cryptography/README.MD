## Type of encryption Keys
- `Symmetric Keys:`
The same encryption key is used to both encrypt and decrypt the data. This means of encryption is used primarily to protect data at rest.
    - `Block algorithms` Set lengths of bits are encrypted in blocks of electronic data with the use of a specific secret key. As the data is being encrypted, the system holds the data in its memory as it waits for complete blocks.
    - `Stream algorithms` Data is encrypted as it streams instead of being retained in the system’s memory.

- `Asymmetric Keys:`
A pair of keys for the encryption and decryption of the data.They are referred to as a public and a private key. this can be used to protect the Data in Motion.
    - `Public Key:`  this key is primarily used to encrypt the data.
    - `Private Key:` this key is used to decrypt the data that it’s counterpart, the public key, has encrypted. This key must be safeguarded as it is the only key that can decrypt the encrypted data.
