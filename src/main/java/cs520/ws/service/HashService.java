package cs520.ws.service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HashService {

    public HashService()
    {
    }

    private BigInteger hashValue( MessageDigest digest, String text )
    {
        digest.update( text.getBytes() );
        return new BigInteger( 1, digest.digest() );
    }

    @WebMethod
    public String md5( String text ) throws NoSuchAlgorithmException
    {
        MessageDigest digest = MessageDigest.getInstance( "MD5" );
        return String.format( "%1$032X", hashValue( digest, text ) );
    }

    @WebMethod
    public String sha1( String text ) throws NoSuchAlgorithmException
    {
        MessageDigest digest = MessageDigest.getInstance( "SHA1" );
        return String.format( "%1$040X", hashValue( digest, text ) );
    }

}
